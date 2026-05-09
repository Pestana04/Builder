package Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemBuilderTest {

    @Test
    void deveRetornarExcecaoParaPersonagemSemNome() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setRaca("Humano")
                    .setClasse("Guerreiro")
                    .setNivel(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemRaca() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setNome("Arthas")
                    .setClasse("Paladino")
                    .setNivel(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Raça inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemClasse() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setNome("Lyra")
                    .setRaca("Elfa")
                    .setNivel(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Classe inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemComNivelInvalido() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setNome("Thorin")
                    .setRaca("Anão")
                    .setClasse("Guerreiro")
                    .setNivel(0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nível inválido", e.getMessage());
        }
    }

    @Test
    void deveCriarPersonagemValido() {
        PersonagemBuilder personagemBuilder = new PersonagemBuilder();

        Personagem personagem = personagemBuilder
                .setNome("Gustavo")
                .setRaca("Dragonborn")
                .setClasse("Paladino")
                .setNivel(4)
                .setForca(18)
                .setDestreza(10)
                .setConstituicao(16)
                .setInteligencia(8)
                .setSabedoria(12)
                .setCarisma(14)
                .setArma("Espada longa")
                .setArmadura("Cota de malha")
                .setMagia("Curar Ferimentos")
                .setAlinhamento("Caótico Bom")
                .setHistoria("Paladino em busca de vingança")
                .build();

        assertEquals("Gustavo", personagem.getNome());
        assertEquals("Dragonborn", personagem.getRaca());
        assertEquals("Paladino", personagem.getClasse());
        assertEquals(4, personagem.getNivel());
        assertEquals(18, personagem.getForca());
        assertEquals("Espada longa", personagem.getArma());
        assertEquals("Caótico Bom", personagem.getAlinhamento());
    }
}