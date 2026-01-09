public class FizzBuzz {

    private static final int ITERATIONS = 100; 
    public void play() {
        for(int i = 1; i <= ITERATIONS; i++) {
            String generatedOutput = getOutputFromValue(i);
            System.out.println(generatedOutput);
        }
    }

    public String getOutputFromValue(int numberToAnalyze) {

        StringBuilder output = new StringBuilder();

        if (containsNumber(numberToAnalyze, 3)) {
            output.append("Fizz");
        }
        if (isDivisibleByNumber(numberToAnalyze, 3)) {
            output.append("Fizz");
        }
        if (containsNumber(numberToAnalyze, 5)) {
            output.append("Buzz");
        }
        if (isDivisibleByNumber(numberToAnalyze, 5)) {
            output.append("Buzz");
        }
        return output.isEmpty() ? String.valueOf(numberToAnalyze) : String.valueOf(output);
    }

    private boolean containsNumber(int numberToAnalyze, int numberToLookFor) {
        String numberToAnalyzeAsString = String.valueOf(numberToAnalyze);
        String numberToLookForAsString = String.valueOf(numberToLookFor);
        return numberToAnalyzeAsString.contains(numberToLookForAsString);  
    }

    private boolean isDivisibleByNumber(int numberToAnalyze, int module) {
        return numberToAnalyze % module == 0;
    }

}