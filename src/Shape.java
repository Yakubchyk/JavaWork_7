public class Shape {

    public void draw(){
        System.out.println("Draw..." + this.getClass().getName());
    }

    public void erase() {
        System.out.println("Erase ..." + this.getClass().getName());
    }


}
