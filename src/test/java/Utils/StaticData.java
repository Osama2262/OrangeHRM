package Utils;

public class StaticData {
    private static final String DEFAULT_user ="Admin";
    private static final String DEFAULT_pass ="admin123";
    private static final String viewSystemUsersURL ="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
    private static final String viewLocationsURL = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewLocations";
    private static final String viewJobTitleListURL = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewJobTitleList";
    private static final String LoremIpsumMessage ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut in neque magna. In ullamcorper sapien lacus, in consectetur libero aliquam vel. Maecenas iaculis scelerisque dolor ut pulvinar. Vestibulum et vehicula nibh, nec placerat lectus. Pellentesque pellentesque, risus non cursus rhoncus, arcu orci fermentum erat, id dapibus enim dolor nec ipsum. Maecenas at nunc eget mi facilisis porta. Praesent";
    private static final String viewEmployeeList ="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
    public static String getDEFAULT_user() {
        return DEFAULT_user;
    }

    public static String getDEFAULT_pass() {
        return DEFAULT_pass;
    }

    public static String getViewSystemUsersURL() {
        return viewSystemUsersURL;
    }

    public static String getViewLocationsURL() {
        return viewLocationsURL;
    }

    public static String getViewJobTitleListURL() {
        return viewJobTitleListURL;
    }

    public static String getLoremIpsumMessage() {
        return LoremIpsumMessage;
    }

    public static String getViewEmployeeList() {
        return viewEmployeeList;
    }





}
