package serg.goncharik.black13cat.entitiesForJavaConfiguration;

public class Engenier implements People{

    private String name;

    public void toCreateSomething(){
        System.out.println("I engenier and I do something");
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
