import java.util.HashMap;
import java.util.Objects;
import java.io.IOException

public class FIO {
    public static void main(String[] args) {
        ParsData parsData = new ParsData();  //объект класса ParsData
        String newFileName = null;
        WriteFile writeFile = new WriteFile();  //объект класса WriteFile

        HashMap<String, Object> data = parsData.parsInputData(); //Словарь
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e){
                data = parsData.parsInputData();
            }
        }
    }
}