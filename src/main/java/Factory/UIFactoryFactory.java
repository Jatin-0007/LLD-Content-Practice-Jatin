package Factory;

public class UIFactoryFactory {

    public static UIFactory getsupportedPlatform(Supportedplatform supportedplatform) {
        if(supportedplatform.equals(Supportedplatform.IOS)){
            return new iosUIfactory();
        } else if (supportedplatform.equals(Supportedplatform.ANDROID)) {
            return new androidUIfactory();

        } else if (supportedplatform.equals(Supportedplatform.WINDOWS)) {
            return new windowsUIfactory();

        }

        return null;
    }
}
