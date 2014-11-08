
package org.robovm.bindings.xplodeBinding.sample;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIApplicationDelegateAdapter;
import org.robovm.bindings.xplodeBinding.Xplode;
import org.robovm.objc.block.VoidBlock1;
import org.robovm.objc.block.VoidBlock2;

public class Sample extends UIApplicationDelegateAdapter {
	@Override
	public void didFinishLaunching (UIApplication application) {
		Xplode.initializeWithAppHandle("Geomatches", "cda68ec7e3cb591afadef9ad197fdbc9" , new VoidBlock1<NSError>(){

			@Override
			public void invoke(NSError a) {
				// TODO Auto-generated method stub
				if(a == null)
				{
					System.out.println("sem Erro");
					System.out.println(Xplode.isPromotionDockVisible());
					Xplode.setupPromotionDockForBreakpoint("GeoMatchesGrid", 0, new VoidBlock2<Boolean, NSError>(){

						@Override
						public void invoke(Boolean a, NSError b) {
							// TODO Auto-generated method stub
							System.out.println("Aqui");
							if(b == null)
							{
								System.out.println("BLZ");
								Xplode.showPromotionDockAndBounce(false);
							}else
							{
								System.out.println("NAO FOI!");
								System.out.println(b.toString());
							}
						}
						
					});
					System.out.println("3");
//					Xplode.showPromotionDockAndBounce(false);
				}else
				{
					System.out.println(a.toString());
				}
				System.out.println("2");
			}
		});
		System.out.println("1");
	}

	public static void main (String[] argv) {
		try (NSAutoreleasePool pool = new NSAutoreleasePool()) {
			UIApplication.main(argv, null, Sample.class);
		}
	}
}
