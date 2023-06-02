package com.rs.test.constants;

public class AppConstants {
    private AppConstants() {
    }

    public static final String APP_NAME = "user-management";
    public static final String INSTITUTION = "INSTITUTION";
    public static final String EXPORT_REGISTERED_STAFF_HEADERS = "Employment ID, Staff Type, Name,Specialization, Category, Mobile No.";
    public static final String EXPORT_REMOVED_STAFF_HEADERS = "Employment ID, Staff Type, Name,Specialization, Category, Mobile No., Date of Deletion,Reason";
    public static final String EXPORT_REGISTERED_STAFF_FILE_NAME = "ExportedRegisteredStaff";
    public static final String EXPORT_REMOVED_STAFF_FILE_NAME = "RemovedStaffReport";
    public static final String XLS_EXTENSION = ".xls";
    public static final String REMOVE_STAFF_DATE_FORMAT = "dd-MM-yyyy";
}
