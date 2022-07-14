package Turgutlu.tradesman;

import java.util.List;

public interface TradesmanService {

    public List<Tradesman> getAllTradesman();
    public Tradesman getTradesmanById(int tradesmanId);
    public Tradesman addOrUpdateTradesman(Tradesman tradesman);
    public Tradesman deleteTradesmanTradesman(int tradesmanId) throws Exception;


}
