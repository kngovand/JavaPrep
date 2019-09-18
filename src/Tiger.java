import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
// Could be optimized with helper methods in Animal class
public class Tiger extends Animal {

    Tiger(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Roar I am a tiger");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger");
        tiger.speak();
        boolean type = tiger instanceof Animal;
        System.out.println("My name is " + tiger.getName());
        System.out.println("Am I animal? " + type);
        System.out.println("Can I fly? " + tiger.isFlying());
        System.out.println("Can I walk? " + tiger.isWalking());
        System.out.println("Can I a predator? " + tiger.isPredator());

    }
}
