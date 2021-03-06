package org.assertj.examples.data;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link ClassUsingDifferentClassesWithSameName} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractClassUsingDifferentClassesWithSameNameAssert<S extends AbstractClassUsingDifferentClassesWithSameNameAssert<S, A>, A extends ClassUsingDifferentClassesWithSameName> extends AbstractAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractClassUsingDifferentClassesWithSameNameAssert}</code> to make assertions on actual ClassUsingDifferentClassesWithSameName.
   * @param actual the ClassUsingDifferentClassesWithSameName we want to make assertions on.
   */
  protected AbstractClassUsingDifferentClassesWithSameNameAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual ClassUsingDifferentClassesWithSameName's movieTeam is equal to the given one.
   * @param movieTeam the given movieTeam to compare the actual ClassUsingDifferentClassesWithSameName's movieTeam to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ClassUsingDifferentClassesWithSameName's movieTeam is not equal to the given one.
   */
  public S hasMovieTeam(org.assertj.examples.data.movie.Team movieTeam) {
    // check that actual ClassUsingDifferentClassesWithSameName we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting movieTeam of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.assertj.examples.data.movie.Team actualMovieTeam = actual.getMovieTeam();
    if (!Objects.areEqual(actualMovieTeam, movieTeam)) {
      failWithMessage(assertjErrorMessage, actual, movieTeam, actualMovieTeam);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ClassUsingDifferentClassesWithSameName's team is equal to the given one.
   * @param team the given team to compare the actual ClassUsingDifferentClassesWithSameName's team to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ClassUsingDifferentClassesWithSameName's team is not equal to the given one.
   */
  public S hasTeam(Team team) {
    // check that actual ClassUsingDifferentClassesWithSameName we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting team of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Team actualTeam = actual.getTeam();
    if (!Objects.areEqual(actualTeam, team)) {
      failWithMessage(assertjErrorMessage, actual, team, actualTeam);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
