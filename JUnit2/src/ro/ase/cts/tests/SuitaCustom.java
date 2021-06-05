package ro.ase.cts.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.categorii.TesteUrgente;

@RunWith(Categories.class)
@SuiteClasses({TestGrupa.class,TestGrupaWithMocks.class})
@Categories.IncludeCategory(TesteGetPromovabilitate.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {

}
