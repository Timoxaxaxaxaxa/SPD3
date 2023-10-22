public class Adapter extends EuPlug implements AmericanPlug{ //adapter for convert

    @Override //overiding java method from java interfcae
    public void ConnectLaptop() {
        adapterLaptop(); //replacing method in java to php
    }

    @Override //overiding java method from java interfcae
    public void ConnectTeapot() {
        adapterTeapot(); //replacing method in java to php
    }

    @Override //overiding java method from java interfcae
    public void ConnectTV() {
        adapterTV(); //replacing method in java to php
    }

}