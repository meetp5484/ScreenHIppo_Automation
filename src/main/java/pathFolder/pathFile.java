package pathFolder;

public class pathFile {


    public static String LOGIN_BTN = "//button[@type='submit']";
    public static String SCREEN_TEXT_HOMEPAGE = "//h1[normalize-space()='Screens']";
    public static String INPUT_FILE_PATH = "/home/azilen/Meet _assignment/java dev/Spring/ScreenHIppo_BDD/src/test/resources/TestData";// change your path
    public static String EMAIL_FOR_USER = "meet.patel@azilen.com";
    public static String PASSWORD_FOR_USER = "patelmeet";
    public static int TIMEOUT_TEN_SECOND = 10;
    public static int TIMEOUT_TWENTY_SECOND = 20;


    //Signup

    public static String GO_SIGNUP_PAGE = "//a[normalize-space()='Create Account']";
    public static String SIGNUP_NAME = "//input[@id='name']";
    public static String SIGNUP_ORGANIZATION = "//input[@id='organizationName']";
    public static String EMAIL = "//input[@id='email']";
    public static String SIGNUP_PHONE = "//input[@id='phoneNo']";
    public static String PASSWORD = "//input[@id='password']";
    public static String SUBMIT = "//button[@type='submit']";
    public static String SIGNUP_CREATEACCOUNT_TEXT = "//div[contains(text(),'Create Account')]";
    public static String CREATE_ACCOUNT_BTN = "//a[contains(text(),'Create Account')]";
    public static String SIGNUP_LOGIN_CHECKYUORBOX_TEXT = "//div[contains(text(),'Check your inbox')]";
    public static String VALUE_ERROR_MSG = "//div[contains(text(),'Value should be less than 70 character')]";
    //Login
    public static String HOME_TEXT = "//h1[contains(text(),'Screens')]";
    public static String LOGIN_TEXT = "//div[contains(text(),'Login')]";

    //Forgot

    public static String FORGOT_PASSWORD = "//a[contains(text(),'Forgot Password?')]";
    public static String FORMGOT_PASSWORD_TEXT = "//div[contains(text(),'Forgot Password')]";
    public static String FORGOT_EMAILID = "//input[@id='email']";
    public static String SEND_RESET_LINK = "//span[contains(text(),'Send Reset Link')]";
    public static String FORGOT_ERROR_EMAIL = "//div[contains(text(),'Please Enter Valid EmailId')]";
    public static String FORGOT_ERROR_ENTER_EMAIL = "//div[contains(text(),'Please Enter Email')]";
    //Screen
    public static String SCREEN_BTN = "//a[@href='/screens']";
    public static String PAIR_SCREEN = "//span[contains(text(),'Pair Screen')]";
    public static String ENTER_DIGIT = "input";     // tag name
    public static String SIXDIGIT = "123456";

    //Schedule    //span[normalize-space()='Create Schedule']
    public static String SCHEDULE_BTN = "//a[contains(@href,'/schedule')]";
    public static String CREATE_SCHEDULE = "//span[normalize-space()='Create Schedule']";
    public static String NAME_SCHEDULE = "//input[@placeholder='New Schedule']";
    public static String CREATE_SCHEDULE_BTN = "//button[normalize-space()='Create']";
    public static String ADD_CONTENT = "//div[normalize-space()='Add Content']";
    public static String SELECT_IMAGE = "//img[contains(@class, 'object-contain') and contains(@class, 'w-full') and contains(@class, 'h-full')]";
    public static String SET_CONTENT_BTN = "//button[@class='btn primary-btn']";
    public static String TEMP_CLICK = "//span[@class='mb-2 text-sm text-primaryText']";
    public static String TEMP_OK = "//span[normalize-space()='OK']";


    //Footer
    public static String POWERED_BY_SCREENHPPO_TEXT = "//div[@class='text-white text-sm']";
    public static String CONTACT_US = "//a[normalize-space()='Contact Us']";
    public static String INSIDE_CONTACT_US_TEXT = "//div[contains(text(), 'Get in Touch with')]";

    public static String PRIVACY_POLICY = "//a[normalize-space()='Privacy Policy']";
    public static String PRIVACY_POLICY_TEXT = "//h1[normalize-space()='Privacy Policy']";
    public static String TERMS_AND_CONDITIONS = "//a[normalize-space()='Terms and Conditions']";
    public static String TERMS_AND_CONDITIONS_TEXT = "//h1[contains(text(),'ScreenHippo Terms of Service Agreement')]";


    //Profile
    //Subscription
    //Logout
    public static String USERAVTAR = "//div[contains(@class,'user-avtar')]";
    public static String LOGOUT_BTN = "//body/div[4]/div[1]/div[1]/ul[1]/li[3]";

    //Media
    public static String MEDIA_BTN = "a[href='/media']";
    public static String UPLOAD_BTN = "//span[normalize-space()='Upload']";
    public static String INPUT_FILE = "//input[@type='file']";
    public static String INVALID_FILE = INPUT_FILE_PATH + "/temp.zip";   // xpath for file
    public static String UPLOAD_MEDIA = "//div[contains(text(),'Upload Media')]";
    public static String NAVIGATE_BACK_UPLOAD = "//span[@class='hippo-modal-close-x']//*[name()='svg']";
    public static String SAVE_MEDIA_BTN = "//button[@class='ant-btn ant-btn-primary ant-btn-lg custom-primary-btn px-5']";
    public static String POPUP_MAX_CAP_ON_ITEM_TEXT = "//span[contains(text(),'Maximum size for video is 200 MB and other files i')]";
    public static String POPUP_INVALID_FORMAT_ITEM_TEXT = "//span[contains(text(), ' is not an accepted file type.')]";
    public static String TOTAL_SIZE = "//div[contains(text(), 'Total uploaded media size:')]";
    public static String TOTAL_SIZE_NULL = "//span[contains(text(),'No uploaded media found')]";
    public static String MEDIA_TEXT = "//h1[contains(text(),'Media')]";
    public static String UPLOAD_MEDIA_INSIDE = "//div[@class='flex items-center']";

    //Link
    public static String CONTENT_BTN = "//p[contains(text(),'Content')]";
    public static String LINK_BTN = "a[href='/links']";
    public static String LINK_TEXT = "//h1[normalize-space()='Links']";
    public static String LINK_NAME_TEMP = "//span[normalize-space()='abcSwaglab']";
    public static String SORT_ITEM = "//div[@class='ant-select-selector']";
    public static String SORT_BY_NAME = "//div[contains(text(),'Name')]";
    public static String SORT_BY_RECENT = "//div[contains(text(),'Recent')]";
    public static String ADD_LINK = "//span[normalize-space()='Add Link']";
    public static String ENTER_URL = "//input[@placeholder='https://']";
    public static String URL_TEXT = "//label[normalize-space()='URL']";
    public static String NAME_TEXT = "//label[normalize-space()='Name']";
    public static String NAME_EDIT_TEXT = "//input[contains(@class, 'ant-input') and contains(@class, 'input')]";
    public static String ADD_BTN = "//button[contains(text(),'Add Link')]";
    public static String ERROR_MSG = "//div[contains(text(),'Enter a valid URL')]";

    //Canvas
    public static String CANVAS_TEXT = "//h1[contains(text(),'Canvas')]";
    public static String CANVAS_BTN = "a[href='/canvas']";
    public static String CREATE_CANVAS_BTN = "//span[contains(text(),'Create Canvas')]";
    public static String CLICK_SCREEN = "//canvas[@class='upper-canvas ']";
    public static String ADD_TEXT = "//aside[contains(@class,'canvas-sidebar')]//button[1]";
    public static String ADD_CIRCLE = "//aside[contains(@class,'canvas-sidebar')]//button[3]";
    public static String ADD_SQUARE = "//aside[contains(@class,'canvas-sidebar')]//button[5]";
    public static String ADD_RECTANGLE = "//aside[contains(@class,'canvas-sidebar')]//button[4]";
    public static String ADD_TRIANGLE = "//aside[contains(@class,'canvas-sidebar')]//button[6]";
    public static String ADD_PENTAGON = "//aside[contains(@class,'canvas-sidebar')]//button[7]";
    public static String ADD_LINE = "//aside[contains(@class,'canvas-sidebar')]//button[8]";
    public static String ALIGN_TO_LEFT = "//div[@class='canvas-right-sidebar']//button[1]";
    public static String FIRST_IMG_NAME = "//div[@class='w-[88%] truncate'][normalize-space()='zxbs (2)']";
    public static String CENTER_HORIZONTALIY = "//div[@class='canvas-right-sidebar']//button[2]";
    public static String ALIGN_TO_RIGHT = "//div[@class='canvas-right-sidebar']//button[3]";
    public static String ALIGN_TO_TOP = "//div[@class='canvas-right-sidebar']//button[4]";
    public static String CENTER_VERTICALLY = "//div[@class='canvas-right-sidebar']//button[5]";
    public static String ALIGN_TO_BOTTOM = "//div[@class='canvas-right-sidebar']//button[6]";
    public static String SAVE_CANVAS = "//button[contains(@class,'ant-btn ant-btn-default ant-btn-lg ant-btn-compact-item ant-btn-compact-first-item')]";
    public static String SAVE_AND_EXIT = "//span[@aria-label='down']";
    public static String SAVE_AND_EXIT_INSIDE = "//div[contains(text(),'Save & Exit')]";
    public static String CLICK_MY_TEMPLATE_ONLY = "//div[@class='ant-switch-handle']";
    public static String SORT_CANVAS = "//span[contains(text(),'Recent')]";
    public static String SORT_BY_NAME_CANVAS = "//div[contains(text(),'Name')]";
    public static String SORT_BY_RECENT_CANVAS = "//div[contains(text(),'Recent')]";
    public static String BLANK_TEMPLATE = "//div[@class='flex items-center justify-center text-base font-medium bg-white border-2 border-dashed rounded-lg cursor-pointer border-border1 text-secondaryText h-[222px]']";
    public static String TEMPLATE_NAME = "//input[@placeholder='Template Name']";
    public static String SAVE_TEMPLATE = "//button[contains(text(),'Save')]";
    public static String NAVIGATE_BACK = "//div[@class='flex items-center']//a//*[name()='svg']";
    public static String NAVIGATE_BACK_WITH_YES = "//span[normalize-space()='Yes']";
    public static String NAVIGATE_BACK_WITH_NO = "//span[normalize-space()='No']";

    //Playlist

    public static String ENTER_PLAYLIST_NAME = "//input[@placeholder='New Playlist']";
    public static String PLAYLIST_BTN = "//a[@href='/playlists']";
    public static String SEARCH_BY_NAME = "//input[@placeholder='Search by name']";
    public static String ADD_TO_PLAYLIST = "//button[contains(@class,'btn primary-btn')]";
    public static String TOTAL_SIZE_TEXT = "//div[contains(text(),'TOTAL ITEMS')]";
    public static String CREATE_PLAYLIST = "//span[contains(text(),'Create Playlist')]";
    public static String CREATE_BTN = "//button[contains(text(),'Create')]";
    public static String NaviGATE_BACK_PLAYLIST = "//div[@class='flex items-center']//button[@type='button']//*[name()='svg']";
    public static String SORT_BY_PLAYLIST = "//span[contains(text(),'Recent')]";
    public static String PUBLISH_PLAYLIST = "//button[contains(@class,'btn secondary-btn')][contains(text(),'Publish')]";
    public static String ADD_CONTENT_TO_PLAYLIST_TEXT = "//div[contains(text(),'Add Content to Playlist')]";
    //Layout
    public static String LAYOUT_BTN = "//a[contains(@href,'/layout')]";
    public static String CREATE_LAYOUT = "//span[normalize-space()='Create Layout']";
    public static String SECOND_SCREEN = "//body/div[@id='root']/div/section[contains(@class,'ant-layout ant-layout-has-sider min-h-screen')]/section[contains(@class,'ant-layout site-layout')]/main[contains(@class,'ant-layout-content site-layout-background')]/div[contains(@class,'content-wrapper')]/div/div/div[contains(@class,'grid grid-cols-1 lg:grid-cols-2 h-[90vh]')]/div[contains(@class,'left px-5 lg:px-10 py-6 lg:h-[calc(100vh_-_100px)] overflow-auto mt-4')]/div[contains(@class,'w-full py-8')]/div/div[contains(@class,'grid grid-cols-3 md:grid-cols-4 lg:grid-cols-3 xl:grid-cols-4 2xl:grid-cols-6 gap-y-4 gap-x-3')]/div[2]/div[1]";
    public static String FRIST_SCREEN = "//div[contains(@class, 'flex') and contains(@class, 'justify-between') and contains(@class, 'w-full') and contains(@class, 'border-2') and contains(@class, 'border-sudoGreen') and contains(@class, 'bg-sudoGreen') and contains(@class, 'opacity-50')]";
    public static String CLICK_AND_SELECT_PLAYLIST = "//*[name()='path' and contains(@d,'M1.5 1V14L')]";
    public static String CHOOSE_PLAYLIST = "//span[@class='ant-select-selection-search']";
    public static String PUBLISH_LAYOUT = "//div[contains(text(),'Publish')]";


}
