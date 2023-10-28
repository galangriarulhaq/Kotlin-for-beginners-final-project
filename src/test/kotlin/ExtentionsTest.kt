import org.junit.jupiter.api.Assertions

fun assertEqualsWith(expected: Any?, actual: Any?, errMessage: String) {
    if (expected != actual) {
        Assertions.fail<String>(errMessage)
    }
}

fun Boolean.returnTrue(errMessage: String) {
    if (!this) {
        Assertions.fail<String>(errMessage)
    }
}

fun Boolean.returnFalse(errMessage: String) {
    if (this) {
        Assertions.fail<String>(errMessage)
    }
}
