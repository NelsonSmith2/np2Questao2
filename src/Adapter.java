import com.stark.cooporation.FarenheitSensor;

public class Adapter implements InterfaceTemperatura{
    @Override
    public double parseTemperatura(){
        FarenheitSensor fSensor = new FarenheitSensor();
        double parseCelcius = (fSensor.getTemperaturaFarenheit() - 32) * 5/9;
        return parseCelcius;
    }
}
