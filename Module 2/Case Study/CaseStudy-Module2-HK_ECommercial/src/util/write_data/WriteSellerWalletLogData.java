package util.write_data;

import com.opencsv.CSVWriter;
import database.DataBase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteSellerWalletLogData {
    private static WriteSellerWalletLogData writeSellerWalletLogData;

    private WriteSellerWalletLogData() {

    }

    public static WriteSellerWalletLogData getWriteSellerWalletLogData() {
        if (writeSellerWalletLogData == null) {
            writeSellerWalletLogData = new WriteSellerWalletLogData();
            return writeSellerWalletLogData;
        } else return writeSellerWalletLogData;
    }

    public void writeData() {
        File file = new File(".\\src\\database\\wallet\\seller_wallet_log.csv");
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(file));
            List <String[]> list = new ArrayList <>();
            DataBase.sellerWalletLogMap.forEach((key, value) -> {
                list.add(value.csvFormat().split(","));
            });
            csvWriter.writeAll(list);
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
