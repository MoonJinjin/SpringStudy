package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(JavaConfig.class);		//java  ����
		
		//LoginDAO ��������
		//LoginDTO �����ͼ�  ���� �Է��Ѵ� (kim,1111) 
		//insert_data ȣ���غ�
		LoginDAO dao=ctx.getBean(LoginDAO.class);
		/*
		 * LoginDTO dto1=ctx.getBean(LoginDTO.class); dto1.setUserid("kim");
		 * dto1.setUserpass(1111);
		 */
		
		/*
		 * LoginDTO dto2 = ctx.getBean(LoginDTO.class); dto2.setUserid("lee");
		 * dto2.setUserpass(2222);
		 */
		
		/*
		 * LoginDTO dto3 = ctx.getBean(LoginDTO.class); dto3.setUserid("kim");
		 * dao.delete_data(dto3);
		 */
		
		List<LoginDTO> list = dao.select_data();
		for(LoginDTO dto4 : list) {
			// list�� ����ִ� ������ �ϳ��� LoginDTO Ÿ���� dto4�� ���Խ�Ų��.
			System.out.print(dto4.getUserid());
			System.out.println(dto4.getUserpass());
		}
		
		ctx.close();
		
	}
}