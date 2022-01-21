package appdata;

import java.util.Objects;

public class YodaData {
    int aNum;
    String aString;

    public YodaData() {}

    public YodaData(int aNum, String aString) {
        this.aNum = aNum;
        this.aString = aString;
    }

    public int getaNum() {
        return aNum;
    }

    public void setaNum(int aNum) {
        this.aNum = aNum;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YodaData yodaData = (YodaData) o;
        return aNum == yodaData.aNum && aString.equals(yodaData.aString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aNum, aString);
    }

    @Override
    public String toString() {
        return "YodaData{" +
                "aNum=" + aNum +
                ", aString='" + aString + '\'' +
                '}';
    }
}
