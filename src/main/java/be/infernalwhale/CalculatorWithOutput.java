package be.infernalwhale;

public class CalculatorWithOutput {
    private OutputInterface outputter;
    private SomeRepository repository;

    public CalculatorWithOutput(OutputInterface outputter,
                                SomeRepository repository) {
        this.repository = repository;
        this.outputter = outputter;
    }

    public int sum(int a, int b) {
        int result = a + b;
        this.outputter.print(String.format("Sum of %d and %d is %d", a, b, result));

        return result;
    }
}
