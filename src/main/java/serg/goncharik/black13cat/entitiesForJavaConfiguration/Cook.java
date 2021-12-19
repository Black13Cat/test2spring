package serg.goncharik.black13cat.entitiesForJavaConfiguration;

public class Cook implements People{

    private String name;

    public void toCookSomething(){
        System.out.println("I cook and I cooking");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String aName) {
        this.name = aName;
    }
}
