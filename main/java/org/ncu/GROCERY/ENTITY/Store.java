package org.ncu.GROCERY.ENTITY;



import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "store_table")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeId;
    @OneToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
    @Column(length = 100, nullable = false)
    private String location;
    @Column(length = 50, nullable = false)
    private String openingHours;
    @ElementCollection
    private List<String> deliveryAreas;
    @Column(nullable = false)
    private double minimumOrderAmount;


    public Store() {}

    public Store(int storeId, User user, String location, String openingHours, List<String> deliveryAreas, double minimumOrderAmount) {//List<Product> productCatalog
        this.storeId = storeId;
        this.user = user;
        this.location = location;
        this.openingHours = openingHours;
        this.deliveryAreas = deliveryAreas;
        this.minimumOrderAmount = minimumOrderAmount;
//        this.productCatalog = productCatalog;
    }

    public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public List<String> getDeliveryAreas() {
		return deliveryAreas;
	}

	public void setDeliveryAreas(List<String> deliveryAreas) {
		this.deliveryAreas = deliveryAreas;
	}

	public double getMinimumOrderAmount() {
		return minimumOrderAmount;
	}

	public void setMinimumOrderAmount(double minimumOrderAmount) {
		this.minimumOrderAmount = minimumOrderAmount;
	}



	@Override
    public String toString() {
        return "Store [storeId=" + storeId + ", user=" + user + ", location=" + location + ", openingHours=" + openingHours + ", deliveryAreas=" + deliveryAreas + ", minimumOrderAmount=" + minimumOrderAmount + ", productCatalog=" /*+ productCatalog*/+ "]";
    }

  
}

