package abstractFactory;

public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(938);
    }

    @Override
    public void install() {
        createCpu().calculate();
        createMainboard().installCPU();
    }


}