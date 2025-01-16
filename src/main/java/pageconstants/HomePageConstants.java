package pageconstants;

public class HomePageConstants {
	
	/**
     * Instantiates a new constants.
     */
    private HomePageConstants() {}
    
    public static final String OPTION_WOMEN = "//div[@id='accordian']//a[@href='#Women']";
    /** The Constant GET_STATUS_CODE. */
    public static final String OPTION_DRESS = "//div[@id='Women']//a[text()='Dress ']";
    
    
    public static final String VIEW_PRODUCT = " (//div/p[text()='Stylish Dress']//following::a[text()='View Product'])[1]";
    
    public static final String SELECT_QUANTITY = "//input[@id='quantity']";
    
    public static final String ADDTO_CART = "//button[@class='btn btn-default cart']";
    
    public static final String CONTINUE_SHOPPING = "//button[@class='btn btn-success close-modal btn-block']";
    
    public static final String OPTION_PRODUCTS = "//a[@href='/products']";
    
    public static final String OPTION_BABYHUG = "//a[@href='/brand_products/Babyhug']";
    
    public static final String SELECT_ITEM_HALF_SLEEVES= "(//div/p[text()='Half Sleeves Top Schiffli Detailing - Pink'])[1]";
    
    public static final String ADD = "//div[@class='product-overlay']/div/p[text()='Half Sleeves Top Schiffli Detailing - Pink']//parent::div/a[text()='Add to cart']";
    
    public static final String VIEW_CART = "//u[normalize-space()='View Cart']";
    
    public static final String CHECK_OUT = "//a[@class='btn btn-default check_out']";
    
    public static final String REGISTER_USER_BUTTON = "//u[normalize-space()='Register / Login']";
    
    public static final String USER_NAME = "//input[@placeholder='Name']";
    
    public static final String USER_EMAIL = "//input[@data-qa='signup-email']";
    
    public static final String SIGNUP_BUTTON = "//button[normalize-space()='Signup']";
    
    public static final String USER_PASSWORD = "//input[@id='password']";
    
    public static final String USER_FIRST_NAME = "//input[@id='first_name']";
    
    public static final String USER_LAST_NAME = "//input[@id='last_name']";
    
    public static final String USER_ADDRESS = "//input[@id='address1']";
    
    public static final String USER_STATE = "//input[@id='state']";
    
    public static final String USER_CITY = "//input[@id='city']";
    
    public static final String USER_ZIP_CODE = "//input[@id='zipcode']";
    
    public static final String USER_MOBLIE_NUMBER = "//input[@id='mobile_number']";
    
    public static final String CREATE_ACOUNT_BUTTON = "//button[normalize-space()='Create Account']";
    
    public static final String CONTINUE = "//a[@data-qa='continue-button']";
    
    public static final String CART = "//a[text()=' Cart']";
    
    public static final String PLACE_ORDER = "//a[@class='btn btn-default check_out']";
    
    public static final String NAME_ON_CARD = "//input[@name='name_on_card']";
    
    public static final String CARD_NUMBER = "//input[@name='card_number']";
    
    public static final String CARD_CVV = "//input[@placeholder='ex. 311']";
    
    public static final String CARD_EXPIRY_MONTH = "//input[@placeholder='MM']";
    
    public static final String CARD_EXPIRY_YEAR = "//input[@placeholder='YYYY']";
    
    public static final String PAY_CONFIRM = "//button[@id='submit']";
    
    public static final String ORDER_PLACE_TEXT = "//b[normalize-space()='Order Placed!']";
    
    public static final String DOWNLOAD_INVOICE = "//a[@class='btn btn-default check_out']";
    
    public static final String LOGOUT = "//a[text()=' Logged in as ']";
    

}
