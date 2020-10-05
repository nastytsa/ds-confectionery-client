package ds.confectionery_client.payloads;

import ds.confectionery_client.models.dessertName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DessertPayload {
    private dessertName name;
    private double price;
}
