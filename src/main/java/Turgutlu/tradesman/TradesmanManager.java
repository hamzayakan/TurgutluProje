package Turgutlu.tradesman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradesmanManager implements TradesmanService{

    @Autowired
    private TradesmanRepository tradesmanRepository;

    @Override
    public List<Tradesman> getAllTradesman() {
        return (List<Tradesman>) tradesmanRepository.findAll();
    }

    @Override
    public Tradesman getTradesmanById(int tradesmanId) {
        return tradesmanRepository.findById(tradesmanId).orElse(null);
    }

    @Override
    public Tradesman addOrUpdateTradesman(Tradesman tradesman) {
        return tradesmanRepository.save(tradesman);
    }

    @Override
    public Tradesman deleteTradesmanTradesman(int tradesmanId) throws Exception{
        Tradesman deleteTradesman = null;
        try {
            deleteTradesman = tradesmanRepository.findById(tradesmanId).orElse(null);
           if (deleteTradesman == null) {
               throw new Exception("Tradesman not avaible");
           }else{
               tradesmanRepository.deleteById(tradesmanId);
           }
        }catch (Exception ex){
            throw ex;
        }
        return deleteTradesman;
    }
}
