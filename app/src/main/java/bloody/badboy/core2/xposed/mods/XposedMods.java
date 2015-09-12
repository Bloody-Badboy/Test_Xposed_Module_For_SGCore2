package bloody.badboy.core2.xposed.mods;

import android.content.res.XModuleResources;
import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;

public class XposedMods implements IXposedHookInitPackageResources,IXposedHookZygoteInit
{
    private static String MODULE_PATH;

	public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) throws Throwable
	{
        MODULE_PATH = startupParam.modulePath;
    }

    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam resparam) throws Throwable
	{
		if(!resparam.packageName.equals("com.android.systemui"))
            return;

		XModuleResources modRes = XModuleResources.createInstance(MODULE_PATH,resparam.res);

		/*
		 * FOR BATTERY ICON REPLACEMENT
		 */
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","stat_sys_battery",modRes.fwd(R.drawable.stat_sys_battery));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","stat_sys_battery_charge",modRes.fwd(R.drawable.stat_sys_battery_charge));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","qs_sys_battery",modRes.fwd(R.drawable.stat_sys_battery));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","qs_sys_battery_charging",modRes.fwd(R.drawable.stat_sys_battery_charge));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}

		/*
		 * FOR SINGLE SIM SIGNALBAR REPLACEMENT
		 */

		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","tw_stat_sys_5_level_signal_0",modRes.fwd(R.drawable.signal_level_0));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","tw_stat_sys_5_level_signal_1",modRes.fwd(R.drawable.signal_level_1));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","tw_stat_sys_5_level_signal_2",modRes.fwd(R.drawable.signal_level_2));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","tw_stat_sys_5_level_signal_3",modRes.fwd(R.drawable.signal_level_3));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","tw_stat_sys_5_level_signal_4",modRes.fwd(R.drawable.signal_level_4));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}

		/*
		 * FOR WIFI SIGNALBAR REPLACEMENT
		 */

		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","stat_sys_wifi_signal_0",modRes.fwd(R.drawable.wifi_signal_level_0));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","stat_sys_wifi_signal_1",modRes.fwd(R.drawable.wifi_signal_level_1));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
     		{
			resparam.res.setReplacement("com.android.systemui","drawable","stat_sys_wifi_signal_2",modRes.fwd(R.drawable.wifi_signal_level_2));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","stat_sys_wifi_signal_3",modRes.fwd(R.drawable.wifi_signal_level_3));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","stat_sys_wifi_signal_4",modRes.fwd(R.drawable.wifi_signal_level_4));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
		try
		{
			resparam.res.setReplacement("com.android.systemui","drawable","stat_sys_wifi_signal_null",modRes.fwd(R.drawable.wifi_signal_null));
		}
		catch(Throwable e)
		{
			XposedBridge.log(e);
		}
	}
}
