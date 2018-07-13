public class East extends Compass {

    double meters;
    String walking;
    public East( double meters, String walking){

        this. meters = meters;
        this.walk = walk();
        this.walking = walking;
    }

    @Override
    public double walk() {
        return 1;
    }

    @Override
    public String toString(){
        return "East : " + walk;
    }
}
