package top.weixiansen574.bilibiliArchive.bean.response;

public enum BackupRCode implements CodeProvider {
    CAN_NOT_CHANGE_CONFIG_AT_RUNNING(2000),
    VIDEO_BACKUP_CONFIG_NAME_EXISTS(2001),
    VIDEO_BACKUP_CONFIG_NEED_NAME(2002),
    VIDEO_BACKUP_CONFIG_ILLEGAL(2003),
    VIDEO_BACKUP_CONFIG_REFERENCED(2004),
    FFMPEG_NOT_INSTALLED(2012),
    SETTING_PRIORITY_ID_NO_MISMATCH(2101),

    BACKUP_CONFIG_ILLEGAL(2200),
    VIDEO_BACKUP_CONFIG_NOT_EXISTS(2201),
    USER_NOT_EXISTS(2202),
    VIDEO_NOT_EXISTS(2203),

    BACKUP_FAV_EXISTS(2211),
    BACKUP_FAV_NOT_FOUND(2210),
    FAV_VIDEO_ONLINE_NOT_REMOVED(2212),

    BACKUP_UPLOADER_EXISTS(2221),
    BACKUP_UPLOADER_NOT_FOUND(2220),

    BACKUP_HISTORY_EXISTS(2231),
    BACKUP_HISTORY_NOT_FOUND(2230),

    OTHER_TASKS_IN_PROGRESS(2300),

    UPDATE_PLAN_CONFLICTS(2400);


    private final int code;

    BackupRCode(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
