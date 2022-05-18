public class DataTypeOne {
    public static void main(String[] args) {
        //Задача №1
        byte newPen = 127;
        short newPencil = 777;
        int teaCup = 12;
        long priceCar = 5_000_000L;
        float gallonGasoline = 3.785411784f;
        double numberPi = 3.1415926535;

        //Задача №2
        float weightBoxerOne = 78.2f;
        float weightBoxerTwo = 82.7f;
        float totalWeight = weightBoxerOne + weightBoxerTwo;
        float differenceWeight = weightBoxerTwo % weightBoxerOne;
        System.out.println("Общий вес двух бойцов = " + totalWeight + " кг.");
        System.out.println("Разница между весами бойцов = " + differenceWeight + " кг.");

        //Задача №3
        byte bananasPc = 5;
        byte weightOneBanana = 80;
        int fullWeightBananas = bananasPc * weightOneBanana;
        byte volumeMilkConstant = 100;
        byte weightMilkConstant = 105;
        short volumeMilkFull = 200;
        int fullWeightMilk = volumeMilkFull * weightMilkConstant / volumeMilkConstant;
        //float fullWeightMilk = volumeMilkFull * weightMilkConstant / volumeMilkConstant;
        byte iceCreamPc = 2;
        byte weightOneIceCream = 100;
        int fullWeightIceCream = iceCreamPc * weightOneIceCream;
        //float fullWeightIceCream = iceCreamPc * weightOneIceCream;
        byte eggPc = 4;
        byte weightOneEgg = 70;
        //float fullWeightEgg = eggPc * weightOneEgg;
       int fullWeightEgg = eggPc * weightOneEgg;
        float weightBreakfastGram = fullWeightBananas + fullWeightMilk + fullWeightIceCream + fullWeightEgg;
        int weightConstantKilo = 1000;
        float weightBreakfastKilo = weightBreakfastGram / weightConstantKilo;
        //System.out.println("Вес спорт-завтрака составил = "+ weightBreakfastGram + " г.");
        System.out.println("Вес спорт-завтрака составил = "+ weightBreakfastKilo + " кг.");


        //Задача №4
        byte excessWeightKilo = 7;
        short kiloGram = 1000;
        float weightLossGramDay1 = 250;
        float weightLossKiloDay1 = weightLossGramDay1 / kiloGram;
        float dayBeforeNormWeight1 = excessWeightKilo / weightLossKiloDay1;
        System.out.println ("Спортсмен похудеет на 7 кг. теряя по 250 г. в день  за " + dayBeforeNormWeight1 + " дней." );
        float weightLossGramDay2 = 500;
        float weightLossKiloDay2 = weightLossGramDay2 / kiloGram;
        float dayBeforeNormWeight2 = excessWeightKilo / weightLossKiloDay2;
        System.out.println ("Спортсмен похудеет на 7 кг. теряя по 500 г. в день  за " + dayBeforeNormWeight2 + " дней." );
        float weightLossKiloDayAverage = ( weightLossKiloDay1 + weightLossKiloDay2) / 2;
        float dayBeforeNormWeightAverage = excessWeightKilo / weightLossKiloDayAverage;
        System.out.println ("Спортсмен похудеет на 7 кг. " + dayBeforeNormWeightAverage  + " день." );


        //Задача №5

        int salaryMonthMasha = 67760;
        int salaryMonthDenis = 83690;
        int salaryMonthKristina = 76230;
        int monthsYear = 12;
        float indexationCoefficientPercent = 10;
        float indexationCoefficient = indexationCoefficientPercent / 100;
        float newSalaryMonthMasha = salaryMonthMasha * indexationCoefficient + salaryMonthMasha;
        int salaryYearMasha = salaryMonthMasha * monthsYear;
        float newSalaryYearMasha = newSalaryMonthMasha * monthsYear;
        float salaryIncreaseYearMasha = newSalaryYearMasha - salaryYearMasha;
        System.out.println("Маша теперь получает " + newSalaryMonthMasha +
                " рублей. Годовой доход вырос на " + salaryIncreaseYearMasha +" рублей");
        float newSalaryMonthDenis = salaryMonthDenis * indexationCoefficient + salaryMonthDenis;
        int salaryYearDenis = salaryMonthDenis * monthsYear;
        float newSalaryYearDenis = newSalaryMonthDenis * monthsYear;
        float salaryIncreaseYearDenis = newSalaryYearDenis - salaryYearDenis;
        System.out.println("Денис теперь получает " + newSalaryMonthDenis +
                " рублей. Годовой доход вырос на " + salaryIncreaseYearDenis +" рублей");
        float newSalaryMonthKristina = salaryMonthKristina * indexationCoefficient + salaryMonthKristina;
        int salaryYearKristina = salaryMonthKristina * monthsYear;
        float newSalaryYearKristina = newSalaryMonthKristina * monthsYear;
        float salaryIncreaseYearKristina = newSalaryYearKristina - salaryYearKristina;
        System.out.println("Денис теперь получает " + newSalaryMonthKristina +
                " рублей. Годовой доход вырос на " + salaryIncreaseYearKristina +" рублей");








    }
}
