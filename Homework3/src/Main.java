class carExample extends Cars {
    public static void main(String[] args) {
        Cars one = new Cars();
        one.setCountry("USA");
        one.setMaker("Ford");
        one.setModel("Mustang");
        System.out.println("Ford: " + one.getCountry() + "" + one.getModel() + "" + one.getMaker());

        Cars two = new Cars();
        two.setCountry("Germany");
        two.setMaker("BMW");
        two.setModel("X6");
        System.out.println("BMW: " + two.getCountry() + "" + two.getModel() + "" + two.getMaker());

        Cars three = new Cars();
        three.setCountry("Russia");
        three.setMaker("Lada");
        three.setModel("Kopeika");
        System.out.println("Lada: " + three.getCountry() + "" + three.getModel() + "" + three.getMaker());

    }
}






