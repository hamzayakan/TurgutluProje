package Turgutlu.tradesman;

import java.util.List;

public interface TradesmanService {

     List<Tradesman> getAllTradesman();
     Tradesman getTradesmanById(int tradesmanId);
     Tradesman addOrUpdateTradesman(Tradesman tradesman);
     Tradesman deleteTradesmanTradesman(int tradesmanId) throws Exception;


}
