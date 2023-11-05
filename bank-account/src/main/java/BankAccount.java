class BankAccount {

    private final String STATE_CLOSED = "Account closed";
    private final String STATE_NOT_OPEN = "Account not open";
    private final String STATE_ALREADY_OPEN = "Account already open";
    private final String MORE_MONEY = "Cannot withdraw more money than is currently in the account";
    private final String NEGATIVE_AMOUNT = "Cannot deposit or withdraw negative amount";

    private int balance;
    private String state = STATE_NOT_OPEN;

    void open() throws BankAccountActionInvalidException {
        if (state == STATE_ALREADY_OPEN)
            throw new BankAccountActionInvalidException(STATE_ALREADY_OPEN);
            
        balance = 0;
        state = STATE_ALREADY_OPEN;
    }

    void close() throws BankAccountActionInvalidException {
        if (state == STATE_NOT_OPEN)
            throw new BankAccountActionInvalidException(STATE_NOT_OPEN);
            
        balance = 0;
        state = STATE_CLOSED;
    }

    synchronized int getBalance() throws BankAccountActionInvalidException {
        if (state == STATE_CLOSED)
            throw new BankAccountActionInvalidException(STATE_CLOSED);
        else if (state == STATE_NOT_OPEN)
            throw new BankAccountActionInvalidException(STATE_NOT_OPEN);
        
        return balance;
    }

    synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        if (state == STATE_CLOSED || state == STATE_NOT_OPEN)
            throw new BankAccountActionInvalidException(STATE_CLOSED);

        if (amount < 0)
            throw new BankAccountActionInvalidException(NEGATIVE_AMOUNT);

        balance += amount;
    }

    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        if (state == STATE_CLOSED)
            throw new BankAccountActionInvalidException(STATE_CLOSED);
        else if (state == STATE_NOT_OPEN)
            throw new BankAccountActionInvalidException(STATE_NOT_OPEN);

        if (amount < 0)
            throw new BankAccountActionInvalidException(NEGATIVE_AMOUNT);
        if (amount > balance)
            throw new BankAccountActionInvalidException(MORE_MONEY);
        
        balance -= amount;
    }

}