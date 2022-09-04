package calculator;

public enum Operation { //енамы нужны, когда есть одинаковые переменные в одном большом коде
    PLUS('+'),  //некое значение, которое может принимать поле из класса
    MINUS('-'),
    DIVISION('/'),
    MULTIPLY('*');

    private char operationSymbol;

    Operation(char operationSymbol) {
        this.operationSymbol = operationSymbol;
    }

    public char getOperationSymbol() {
        return operationSymbol;
    }

    public static Operation getOperationBySymbol(char operationSymbol) {
        for (Operation operation : values()) {
            if (operation.operationSymbol == operationSymbol) {
                return operation;
            }
        }
        return null;
    }
}
