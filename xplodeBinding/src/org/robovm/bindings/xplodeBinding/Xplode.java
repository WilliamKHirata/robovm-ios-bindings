package org.robovm.bindings.xplodeBinding;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.block.VoidBlock1;
import org.robovm.objc.block.VoidBlock2;

@NativeClass(value="Xplode")
public class Xplode extends NSObject{
	static { ObjCRuntime.bind(Xplode.class); }

	@Method(selector = "initializeWithAppHandle:appSecret:andCompletionHandler:")
	public static native void initializeWithAppHandle(String appHandle, String appSecret, @Block VoidBlock1<NSError> andCompletionHandler);
	
	@Method(selector = "isPromotionDockVisible")
	public static native boolean isPromotionDockVisible();
	
	@Method(selector = "setupPromotionDockForBreakpoint:atPosition:withCompletionHandler:")
	public static native void setupPromotionDockForBreakpoint(String breakpoint, int atPosition, @Block VoidBlock2<Boolean, NSError> withCompletionHandler);

	@Method(selector = "showPromotionDockAndBounce:")
	public static native void showPromotionDockAndBounce(boolean bounce);
	
	@Method(selector = "hidePromotionDock")
	public static native void hidePromotionDock();
	
	@Method(selector = "dismissPromotion")
	public static native void dismissPromotion();
	
	@Method(selector = "removePromotionDock")
	public static native void removePromotionDock();
	
	@Method(selector = "isCurrentDeviceSupported")
	public static native boolean isCurrentDeviceSupported();
}
