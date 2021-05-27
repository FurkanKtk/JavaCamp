package business.abstracts;

import entities.GameSale;

public interface IGameSaleService {

	public void add(GameSale gameSale);

	public void delete(GameSale gameSale);

	public void update(GameSale gameSale);
}
