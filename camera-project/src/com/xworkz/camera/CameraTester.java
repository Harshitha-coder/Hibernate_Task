package com.xworkz.camera;

import java.util.Arrays;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImpl;
import com.xworkz.camera.entity.CameraEntity;

public class CameraTester {

	public static void main(String[] args) {

		CameraEntity entity = new CameraEntity("Sony", "Cybershot", "Black", "Plastic", 24.2, 30, true, "Mirror", 1.44);

		CameraEntity entity1 = new CameraEntity("Canon", "EOS1500D", "Black", "Rubber", 32.5, 25, true, "Zoom", 2.5);

		CameraEntity entity2 = new CameraEntity("Panasonic", "DMCG7KGWK", "Black", "Plastic", 16, 35, true, "Mirror",
				2.0);

		CameraDAO dao = new CameraDAOImpl();
		dao.save(entity);
		dao.save(entity1);
		dao.save(entity2);

		CameraEntity value = dao.readById(1);
		System.out.println(value);

		dao.updateBrandById(17, "Fujifilm");

		dao.deleteById(32);

		List<CameraEntity> en = Arrays.asList(entity, entity1, entity2);
		dao.saveList(en);
		dao.deleteList(en);
	}

}
