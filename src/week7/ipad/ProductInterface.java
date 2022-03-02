package week7.ipad;

public interface ProductInterface {

    double HIGH_COST = 3072.0;
    double MIDDLE_COST = 704.0;
    double LOW_COST = 320.0;
    int MEMORYSIZE_MOST = 256;
    int MEMORYSIZE_MIDDLE = 64;
    int MEMORYSIZE_LEAST = 32;

    double computePrice();
}
