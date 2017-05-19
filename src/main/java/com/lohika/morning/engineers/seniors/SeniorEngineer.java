package com.lohika.morning.engineers.seniors;

import com.lohika.morning.engineers.juniors.JuniorEngineer;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "seniors")
public class SeniorEngineer extends JuniorEngineer {
}
