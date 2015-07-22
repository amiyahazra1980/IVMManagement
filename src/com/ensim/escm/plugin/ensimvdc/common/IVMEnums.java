package com.ensim.escm.plugin.ensimvdc.common;


public class IVMEnums {
    public enum vmState
    {
        START("START"), STARTED("STARTED"),
        STOP("STOP"), STOPPED("STOPPED"),
        RESTART("RESTART"), RESTARTED("RESTARTED"),
        SUSPEND("SUSPEND"), SUSPENDED("SUSPENDED"),
        RESUME("SUSPENDED"), RESUMED("RESUMED"),
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
    public enum NetworkType
    {
        BRIDGED("BRIDGED"),
        ISOLATED("ISOLATED"),
        NATROUTED("NATROUTED");
        @SuppressWarnings("unused")
        private final String val;
        private NetworkType(String val)
        {
            this.val = val;
        }
    }

    //---------Added by AM------------
    public enum HDDOPerationType
    {
        ADD("ADD"),
        REMOVE("REMOVE"),
        EDIT("EDIT");
        @SuppressWarnings("unused")
        private final String val;
        private HDDOPerationType(String val)
        {
            this.val = val;
        }
    }
    //-------------End----------------
}
