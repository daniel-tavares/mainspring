package br.com.mainspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    @Bean
    IMensagemService mockMessageService() {
        return new IMensagemService() {
            public String getMessage() {
              return "Hello World!";
            }
        };
    }
    
    @Bean
    Pessoa mockPessoa() {
    	return new Pessoa("Daniel", "danieltavares.web@gmail.com");
    }

  public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
      MensagemImpressao impressao = context.getBean(MensagemImpressao.class,Pessoa.class);
      impressao.imprimir();
  }
}