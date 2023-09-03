package part01;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney> {

    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    public JavaMoney plus(JavaMoney other) {
        return new JavaMoney(amount + other.amount);
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(amount, o.amount);
    }
}
