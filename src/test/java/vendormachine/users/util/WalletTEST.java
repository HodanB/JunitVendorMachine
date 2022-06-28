package vendormachine.users.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class WalletTEST {
	
	
	@Test
    public void testWalletStartCred() {
    	Wallet wallet = new Wallet(1.5f);
    	assertEquals(1.5f,wallet.getAllCredit());
    }
    
    @Test
    public void testWalletStartCredBrand() {
    	Wallet wallet = new Wallet("newBrand", 1.5f);
    	assertEquals("newBrand", wallet.getBrand("gucci"));
    	
    }

    @Test
    public void testAddCredit(){
    	Wallet wallet = new Wallet();
    	wallet.addCredit(2f);
    	assertEquals(1.5f,1.5f, 1f);
    }

    @Test
    public void testGetCreditStored() {
    	Wallet wallet = new Wallet();
    	assertEquals(wallet.getCredit(0.5f), 0.5f);
    }
    
    @Test
    public void testGetCreditExceed() {
    	Wallet wallet1 = new Wallet();
    	assertEquals(wallet1.getCredit(1.5f), 0.0f);
    }
    
    @Test
    public void testGetAllCredit() {
    	Wallet wallet1 = new Wallet();
    	wallet1.addCredit(2f);
    	wallet1.addCredit(3f);
    	assertEquals(5.5f,wallet1.getAllCredit());
    }
    
    @Test
    public void testGetBrand() {
    	Wallet wallet1 = new Wallet();
    	assertEquals("Generic",wallet1.getBrand("gucci"));
    }
    
    @Test
    public void testSetCredit() {
    	Wallet wallet1 = new Wallet();
    	wallet1.setCredit(1.0f);
    	assertEquals(1.0f,wallet1.getAllCredit());    	
    }
    
    @Test
    public void testSetBrand() {
    	Wallet wallet1 = new Wallet();
    	wallet1.setBrand("newBrand");
    	assertEquals("newBrand",wallet1.getBrand("gucci"));  	
    }
}

