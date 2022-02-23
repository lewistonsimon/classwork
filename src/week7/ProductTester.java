package week7;

public class ProductTester {
    public static void main(String[] args)  {
//        Product bigPro = new Product("iPad Pro 12.9", 256, "cellular" );
//        Product pro = new Product("iPad Pro 11", 64, "not cellular");
//        Product iPad = new Product(RegulariPad, 32, "cellular");

//        Product bigPro = new Product(new TwelveiniPadPro(256));
//        Product pro = new Product(new EleveniniPadPro(64));
//        Product iPad = new Product(new RegulariPad(32, true));

        Product iPad = new Product(new RegulariPad(32, true));
        Product iPad2 = new Product(new EleveniniPadPro(64, false));
        Product iPad3 = new Product(new TwelveiniPadPro(256, true));


        System.out.println(iPad + "\n");


    }

}

