package com.devsuperior.spring_batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBatchApplication.class, args);
    }
    
//    @Bean
//    public CommandLineRunner testConnection(DataSource dataSource) {
//        return args -> {
//            System.out.println("=== TESTANDO CONEXÃO COM BANCO DE DADOS ===");
//            
//            try (Connection connection = dataSource.getConnection()) {
//                System.out.println("✅ Conexão bem-sucedida!");
//                System.out.println("URL: " + connection.getMetaData().getURL());
//                System.out.println("Usuário: " + connection.getMetaData().getUserName());
//                System.out.println("Driver: " + connection.getMetaData().getDriverName());
//                System.out.println("Versão do Driver: " + connection.getMetaData().getDriverVersion());
//                
//                // Testar uma consulta simples
//                var stmt = connection.createStatement();
//                var rs = stmt.executeQuery("SELECT 1 as test");
//                if (rs.next()) {
//                    System.out.println("✅ Consulta SELECT 1 funcionou!");
//                }
//                
//            } catch (Exception e) {
//                System.err.println("❌ Falha na conexão: " + e.getMessage());
//                e.printStackTrace();
//            }
//            
//            System.out.println("=== FIM DO TESTE DE CONEXÃO ===");
//        };
//    }
}