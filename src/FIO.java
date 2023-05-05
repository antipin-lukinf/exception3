import java.util.HashMap;
import java.util.Objects;
import java.io.IOException;

public class FIO {
    public static void main(String[] args) {
        ParsData parsData = new ParsData();  //объект класса ParsData
        String newFileName = null;
        WriteFile writeFile = new WriteFile();  //объект класса WriteFile

        HashMap<String, Object> data = parsData.parsInputData(); //Словарь
        while (data.size() != 6) { //цикл ввода данных
            try {
                throw new DataException();
            } catch (DataException e){
                data = parsData.parsInputData();
            }
        }

        newFileName = data.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }

        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath); // вызов метода класса WriteFile
    }
}