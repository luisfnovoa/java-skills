public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3,3);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);

    }

}

credit to the user that shared this in a course I studied at LinkedIn. I added it here to practice concepts so I can improve my skills.
