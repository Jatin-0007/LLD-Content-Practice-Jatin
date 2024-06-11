package Factory;

public class Flutter {

    void UIrefersh(){
        System.out.println("UI is refershed");
    }

    void setTheme(){
        System.out.println("Theme is refershed");
    }

   public UIFactory getUIFactory(Supportedplatform supportedplatform){
        return UIFactoryFactory.getsupportedPlatform(supportedplatform);

   }

}
