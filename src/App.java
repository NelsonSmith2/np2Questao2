import com.stark.cooporation.FarenheitSensor;


public class App {

    private InterfaceTemperatura temperatura;

    public InterfaceTemperatura getTemperatura(){
        return temperatura;
    }

    public void setTemperatura(InterfaceTemperatura temperatura){
        this.temperatura = temperatura;
    }

    public void returnTemperatura() {
        System.out.println("Temperatura em C" + temperatura.parseTemperatura());
    }

    public static void main(String[] args) {

        App app = new App();
        app.setTemperatura(new Adapter());
        app.returnTemperatura();
    }
}
