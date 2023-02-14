public class Phone {
    int number;
    String model;
    double weight;

    // constructor 1
    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // constructor 2
    public Phone(int number, String model) {
            this.number = number;
            this.model = model;
    }

    public void showPhoneModel() {

        System.out.println(this.model);
    }

    public void callTheNumber(int number) {

        System.out.println( "Calling number: " + number );
    }


}



//        4.4 Добавить и вызвать метод, выводящий в консоль модель телефона.
//        4.5 Добавить и вызвать метод, звонящий по номеру телефона - входной параметр.