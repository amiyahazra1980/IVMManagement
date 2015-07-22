package com.ensim.escm.plugin.ensimvdc.common;


public class enums {
    public enum vmState
    {
        START("START"), STARTED("STARTED"),
        STOP("STOP"), STOPPED("STOPPED"),
        RESTART("RESTART"), RESTARTED("RESTARTED"),
        SUSPEND("SUSPEND"), SUSPENDED("SUSPENDED"),
        RESUME("RESUME"), RESUMED("RESUMED"),
        DELETE("DELETE"), UNDERCREATION("UNDERCREATION"),
        CREATIONFAILED("CREATIONFAILED"),
        STARTING("STARTING"),
        STOPPING("STOPPING"),
        UNKNOWN("UNKNOWN");
        @SuppressWarnings("unused")
        private final String val;
        private vmState(String val)
        {
            this.val = val;
        }
        }
    public enum networkType
    {
        BRIDGED("BRIDGED"),
        ISOLATED("ISOLATED"),
        NATROUTED("NATROUTED");
        @SuppressWarnings("unused")
        private final String val;
        private networkType(String val)
        {
            this.val = val;
        }
    }

}
