package Chapter17.functionalInterface.objLongConsumer;

public class Computer {
    private String brandName;
    private Long ramSize;

    public Computer(String brandName, Long ramSize){
        this.brandName = brandName;
        this.ramSize = ramSize;

    }
    public String toString(){
        return "{ your " + brandName+"'s" + "new ram size is " + ramSize + "}";
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return brandName;
    }
    public void setRamSize(Long ramSize){
        this.ramSize = ramSize;
    }

    public Long getRamSize(){
        return ramSize;
    }
}
