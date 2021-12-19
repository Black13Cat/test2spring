package serg.goncharik.black13cat.entitiesForJavaConfiguration;

public class Dancer implements People{

    private String name;

    public Dancer(){

    }

    public Dancer(String aName){
        this.name = aName;
    }

    public void toDanceSomething(){
        System.out.println("I dancer and I dance!");
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
