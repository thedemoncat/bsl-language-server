/*
 * This file is a part of BSL Language Server.
 *
 * Copyright © 2018-2020
 * Alexey Sosnoviy <labotamy@gmail.com>, Nikita Gryzlov <nixel2007@gmail.com> and contributors
 *
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 * BSL Language Server is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * BSL Language Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with BSL Language Server.
 */
package com.github._1c_syntax.bsl.languageserver.diagnostics;

import com.github._1c_syntax.bsl.languageserver.utils.Ranges;
import org.eclipse.lsp4j.Diagnostic;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.github._1c_syntax.bsl.languageserver.util.Assertions.assertThat;

class FunctionReturnsSamePrimitiveDiagnosticTest extends AbstractDiagnosticTest<FunctionReturnsSamePrimitiveDiagnostic> {
  FunctionReturnsSamePrimitiveDiagnosticTest() {
    super(FunctionReturnsSamePrimitiveDiagnostic.class);
  }

  @Test
  void test() {

    List<Diagnostic> diagnostics = getDiagnostics();

  assertThat(diagnostics)
    .hasSize(3)
    .anyMatch(diagnostic -> diagnostic.getRange().equals(
      Ranges.create(0, 8, 0, 23)))
    .anyMatch(diagnostic -> diagnostic.getRange().equals(
      Ranges.create(25, 8, 25, 14)))
    .anyMatch(diagnostic -> diagnostic.getRange().equals(
      Ranges.create(35, 8, 35, 17)));

  }
}
